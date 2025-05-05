
//factorial
public int factorial(int n) {
  if (n<1)
  {
    return 1;
  }
  else return n * factorial(n-1);
}


//bunnyEars
public int bunnyEars(int bunnies) {
  if (bunnies==0)
  {
    return 0;
  }
  else return 2 + bunnyEars(bunnies-1);

}

//fibonacci
public int fibonacci(int n) {
  if (n==1)
  {
    return 1;
  }
  if ( n==0)
  {
    return 0;
  }
  else return fibonacci(n-2)+fibonacci(n-1);
  
}



