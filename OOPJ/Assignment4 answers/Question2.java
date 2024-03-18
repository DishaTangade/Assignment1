/*Write a java program that finds the minimum and maximum values
in an integer array 
array={5,4,3,9,1,7,9}*/
class minMax
{
  public static void main(String args[])
{
  int arr[]={5,4,3,9,1,7,9};
  int numOfElements=arr.length;
  int min=arr[0];
  int max=arr[0];
  int i=0;
  
  for(i=1;i<numOfElements;i++)
  {
    if(arr[i]>max)
    { 
      max=arr[i];
    }
    if(arr[i]<min)
    {
      min=arr[i];
    }
  }
  
  System.out.println("Maximum Value"+arr[0]); 
  System.out.println("Maximum Value"+arr[0]);
}
}

