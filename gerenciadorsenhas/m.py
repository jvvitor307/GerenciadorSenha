from math import floor
h= int(input("digite quantos numeros precisa na horizontal"))
v = int(input("digite quantos numeros precisa na vertical"))
for i in range(floor(v)):
    for z in range(floor(h/2+1)):
        if( i % 2 ==1):
            print('0', end = "")
            if ( v > 1 and z+1 < v): 
                print('1', end = "") 
        if (i % 2 == 0):
            print('1', end = "")
            if( v > 1 and z+1 < v):
                print('0', end = "")
    print()
       