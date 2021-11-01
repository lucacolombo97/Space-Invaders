# Space Invaders Game

*Software Engineering course project at University of Pavia  
Developed in collaboration with: @simoneghiazzi, @riccardocrescenti, @chiarabertocchi, @r1cky0 and @DarioGV*

![Space1](https://user-images.githubusercontent.com/48442855/139663489-8d8d087f-c956-443c-be48-bc13fbcdf41e.png)

## General Overview

Design and Implementation of the Space Invaders game with some changes to the game mechanics and the addition of the multiplayer option up to 4 players.  
Other main aspects:
- Graphic rendering of the game (slick2d library).
- Client-server architecture for multiplayer
- Different difficulty levels for the single player
- Implementation of a leaderboard for single player scores
- Choice of different spaceships

Here it is the Package Tree of the Project:
![PackageTree](https://user-images.githubusercontent.com/48442855/139663308-97eac2de-2088-4fe4-9e59-253be8da1d9f.png)

## Game Rules

- Single Player: the player controls the spaceship at the bottom of the screen, under the bunkers forming a protective barrier, which can move only horizontally. The aliens moves both horizontally and vertically (approaching the spaceship). The spaceship can be controlled to shoot laser to destroy the aliens, while the aliens will randomly shoot towards the spaceship. If an alien is shot by the spaceship, it is destroyed; if the spaceship is shot, one life is lost. If the bunker is hit it will begin to destroy itself until it disappears completely. The initial number of lives is three.
- Alien behavior: the aliens are aligned in a rectangular formation, floating slowly in horizontal direction. As the formation reaches one side, the aliens approach the bottom by a certain amount and start floating in the opposite horizontal direction. The aliens moves faster and faster as the level grows. Any column of the alien may shoot a laser towards the cannon at a random time.
- Scores: Each eliminated alien is worth 10 pts.
- Completing a level: when all aliens are eliminated, the level is completed and the game continues with the next level. 
- Game over: when all lives have been lost, or the aliens have reached a certain vertical position (successfully invaded the planet), the game ends and a game over screen is shown in the playfield. If the player's score is in the top ten, the new score is stored.
- Multiplayer: the game is the same as before, but this time there are up to 4 spaceship fighting together against the aliens.

## Menu
After signing in with the nickname (used for storing the scores), it will appear the main menu where the gamer can:
- choose the playing modality (Single/Multi player)
- read the tutorial
- select his/her favourite spaceship
- consult the top ten ranking

![Menu](https://user-images.githubusercontent.com/48442855/139665550-6799a42b-a514-47c2-be28-dce105461f24.png)

## Tutorial 

![Tutorial](https://user-images.githubusercontent.com/48442855/139663683-e28e8625-df40-4100-861d-399888fc9938.png)

## Operating Instructions

1. Clone the C19 project from GitHub to IntelliJ

3. Inside the src folder, in the `main` package, right click on the `SpaceInvaders` class --> select `create SpaceInvaders.main()...`. In the line `VM OPTIONS` paste the following string:
	* For Ubuntu: `-Djava.library.path=natives_linux`
	* For Windows: `-Djava.library.path=natives_windows`

4. Always in the same window, in the line `Working directory` at the end of the path already present, add `/SpaceInvaders` on Ubuntu and `\SpaceInvaders` on Windows.

6. Run the program.

8. For the multiplayer option: Inside the src folder, in the package `network.server` right click on the class `ServerLauncher` --> select `create ServerLauncher.main()...`. in the line `Working directory` at the end of the path already present, add `/SpaceInvaders` on Ubuntu and `\SpaceInvaders` on Windows.

9. The server is set to play locally. In the configuration file `res/configuration.xml` the IP address of the server can be changed in the client PCs to be able to play with more players.
