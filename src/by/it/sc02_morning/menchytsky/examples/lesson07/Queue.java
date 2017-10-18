package by.it.sc02_morning.menchytsky.examples.lesson07;/*
   Try This 5-2 
 
   A queue class for characters. 
*/ 
 
class Queue { 
  char q[]; // this array holds the queue 
  int putloc, getloc; // the put and get indices 
 
  Queue(int size) { 
    q = new char[size]; // allocate memory for queue 
    putloc = getloc = 0; 
  } 
 
  // put a characer into the queue 
  void put(char ch) { 
    if(putloc==q.length) { 
      System.out.println(" -- Queue is full."); 
      return; 
    } 
     
    q[putloc++] = ch; 
  } 
 
  // get a character from the queue 
  char get() { 
    if(getloc == putloc) { 
      System.out.println(" -- Queue is empty."); 
      return (char) 0;  
    } 
   
    return q[getloc++]; 
  } 
}