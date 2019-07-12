package logic.environment.manager.file;

import java.io.*;

public class FileModifier {

    /**
     * Funzione per la sovrascittura del file degli account. Si utilizza per aggionrare l'highscore
     * e per salvare quale sia lo spirte scelto per la spaceship
     *
     * @param name nome utente
     * @param highScore punteggio record
     * @param shipTypePath tag da confrontare con l'xml "paths.xml" da cui leggere i path delle immagini
     */
    public void modifyFile(String name,int highScore, String shipTypePath) {
        try {
            String file = "res/players.txt";
            String oldLine = "";
            File fileToBeModified = new File(file);
            StringBuilder oldContent = new StringBuilder();
            BufferedReader in = new BufferedReader(new FileReader(fileToBeModified));
            String line = in.readLine();
            while (line != null) {
                String[] componenti = line.split("\\t");
                if (componenti[0].equals(name)) {
                    oldLine = line;
                }
                oldContent.append(line).append(System.lineSeparator());
                line = in.readLine();
            }
            String[] componenti = oldLine.split("\\t");
            componenti[2] = Integer.toString(highScore);
            componenti[3] = shipTypePath;
            String newLine = componenti[0] + "\t" + componenti[1] + "\t" + componenti[2] + "\t" + componenti[3];
            String newContent = oldContent.toString().replaceAll(oldLine, newLine);
            FileWriter out = new FileWriter(fileToBeModified);
            out.write(newContent);
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
