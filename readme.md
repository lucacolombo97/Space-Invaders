# Space Invaders Game

*Software Engineering course project at University of Pavia  
Developed in collaboration with: @simoneghiazzi, @riccardocrescenti, @chiarabertocchi, @r1cky0 and @DarioGV*

Design and Implementation of the Space Invaders game with Java.  
Options: Single Player and MultiPlayer

**ISTRUZIONI UTILIZZO SPACE INVADERS. PROGETTO C-19 UNIPV**

1- Clonare il progetto C19 da GitHub a IntelliJ

2- All' interno di src, nel package "main" fare click destro sulla classe "SpaceInvaders" --> selezionare "create SpaceInvaders.main()..."
Nella finestra incollare nella riga "VM OPTIONS" la stringa seguente:

Per Ubuntu:
-Djava.library.path=natives_linux
	
Per Windows:
-Djava.library.path=natives_windows

Sempre nella stessa finestra nella riga "Working directory" al termine del path già inserito aggiungere "/SpaceInvaders" per Ubuntu e "\SpaceInvaders" per windows

3- Eseguire il programma.
	
4 Per multiplayer: 
All' interno di src, nel package "network.server" fare click destro sulla classe "ServerLauncher" --> selezionare "create ServerLauncher.main()..."
Nella finestra nella riga "Working directory" al termine del path già inserito aggiungere "/SpaceInvaders" per Ubuntu e "\SpaceInvaders" per windows

5 Il server é settato per giocare in locale.
Nel file di configurazione "res/configuration.xml" puó essere cambiato nei pc client l'indirizzo IP del server per poter giocare con più giocatori.
