T = input()
happy = T.count(':-)')
sad = T.count(':-(')
if happy > sad:
    print('happy')
elif happy == sad and happy != 0 and sad != 0:
    print('unsure')
elif happy < sad:
    print('sad')
elif happy == 0 and sad == 0:
    print('none')