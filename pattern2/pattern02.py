def num(a): 
    num = 1
    for i in range(0, a): 
        num = 1
        for k in range(0, i+1): 
            print(num, end=" ") 
            num = num + 1 
        print("\r") 


a = 5
num(a)


