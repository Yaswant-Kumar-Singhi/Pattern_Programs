/*
Pattern:
1 1 1
1 1 1
1 1 1
*/


function pattern01(n){
  var i,j;
  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      document.write("1 ");
    }
    document.write("<br>");
  }
}

pattern01(3);
