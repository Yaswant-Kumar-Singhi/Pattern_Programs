def num(a): 
    # initialising starting number
    num = 1
    # outer loop to handle number of rows
    for i in range(0, a): 
        #re assigning num
        num = 1
        #inner loop
        for k in range(0, i+1):
            # values changing acc. to outer loop
            #printing
            print(num, end=" ") 
             # incrementing number at each column
            num = num + 1 
        print("\r") 

# Driver Code
a = 5
num(a)


