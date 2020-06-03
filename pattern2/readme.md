#### Pattern02

```
1
12
123
1234
12345
```
* The above series looks like right angle.
* The series is divided into rows and columns where total number of rows are 5 and columns are 5.
* let us look how rows and columns are arranged to print the solution
```
[1(i)]  [1(ii)]  [1(iii)]  [1(iv)]  [1(v)]
[2(i)]  [2(ii)]  [2(iii)]  [2(iv)]  [2(v)]
[3(i)]  [3(ii)]  [3(iii)]  [3(iv)]  [3(v)]
[4(i)]  [4(ii)]  [4(iii)]  [4(iv)]  [4(v)]
[5(i)]  [5(ii)]  [5(iii)]  [5(iv)]  [5(v)]

```

* The approach is we need o print first element from first row , then first two elements from second row and so on
* As earlier explain let us consider i to be row and j to be column
* so we need to run a outer loop which will have a inner loop to print the result

##### The solution will also work for-

```
*
**
***
****
*****
```

```
#
##
###
####
#####
```

```
$
$$
$$$
$$$$
$$$$$
```



