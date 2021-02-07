# hackylitics_2021_team_canada
This is our team repository for our submission to Hackylitics 2021!

# The Tennis Player Recruitment Algorithm
This program reads data about international tennis players within a time interal, and produces a list of players that it estimates has high potential to grow
in the future of their careers.

# How to use the program
This specific project was designed to read from .csv files. Once you have your data ready, you may arrange it in a .csv in an order that is compatible with the program,
or you may adjust the program in order to fit your data.

- Navigate to the interpreter folder and open JShell.java
- Replace the placeholder filename with the filename of your .csv file
- Check that the order of your attributes are compatible with CSVReader.java
  -> The shell will print the names and nationalities of the players it thinks may excel!
  
# How it works
The code will interpret the provided data about the year-by-year statistics of tennis players.

For now this is limited to changes in points and ranking.

This data is then put through an algorithm that determines the players who have made the most improvement in the given time-span, 
and estimates which players would be the best to recruit.

# Challenges
As our time was limited and all our findings were limited to Google searches, we decided to start only with points as a parameter.
We hope that our work demonstrates to the jury that if the necessary data is provided to us, we can take it further and add many more parameters to our algorithm
to create a more detailed and powerful head-hunting tool.

# What's next?
We have discussed as a team, and decided that once we are able to access the respective data
we will extend the algorithm to consider age, W/L ratio, win streaks, and current revenue from tennis.
