def num(a): 
    # initialising starting number
    num = 1
    # outer loop to handle number of rows
    for i in range(0, a): 
        #re assigning num
        num = 1
        #inner loop
        for k in range(0, i+1): 
            print(num, end=" ") 
            num = num + 1 
        print("\r") 


a = 5
num(a)


