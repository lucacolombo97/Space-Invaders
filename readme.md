# Space Invaders Game

*Software Engineering course project at University of Pavia  
Developed in collaboration with: @simoneghiazzi, @riccardocrescenti, @chiarabertocchi, @r1cky0 and @DarioGV*

## General Overview

Design and Implementation of the Space Invaders game with some changes to the game mechanics and the addition of the multiplayer option up to 4 players.  
Other main aspects:
- Graphic rendering of the game (slick2d library).
- Client-server architecture for multiplayer
- Different difficulty levels for the single player
- Implementation of a leaderboard for single player scores
- Choice of different spaceships

## Operating Instructions

1. Clone the C19 project from GitHub to IntelliJ

3. Inside the src folder, in the "main" package, right click on the "SpaceInvaders" class --> select "create SpaceInvaders.main()...". In the line "VM OPTIONS" paste the following string:
	* For Ubuntu: -Djava.library.path=natives_linux
	* For Windows: -Djava.library.path=natives_windows

4. Always in the same window, in the line "Working directory" at the end of the path already present, add "/SpaceInvaders" on Ubuntu and "\SpaceInvaders" on Windows.

6. Run the program.

8. For the multiplayer option: Inside the src folder, in the package "network.server" right click on the class "ServerLauncher" --> select "create ServerLauncher.main()...". In the line "Working directory" at the end of the path already entered add "/SpaceInvaders" on Ubuntu and "\SpaceInvaders" on Windows.

9. The server is set to play locally. In the configuration file "res/configuration.xml" the IP address of the server can be changed in the client PCs to be able to play with more players.
