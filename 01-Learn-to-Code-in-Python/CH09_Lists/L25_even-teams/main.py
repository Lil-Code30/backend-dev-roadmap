def split_players_into_teams(players):
    even_team = players[::2]
    odd_team = players[1::2]
    
    return even_team, odd_team


even, odd = split_players_into_teams([
            "Harry",
            "Hermione",
            "Ron",
            "Ginny",
            "Fred",
            "Neville",
            "Draco",
            "Luna",
            "Cho",
            "Gregory",
            "Lee",
            "Michael",
            "Lavender",
            "Frank",
            "Anthony",
            "Allan",
        ])

print(odd , even)