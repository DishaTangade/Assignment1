//Write a java program that calculates the averange in an integer array
//Array={5,4,3,9,1,7,9}
class Avrage
{
  public static void main(String args[])
{
  int arr[]={5,4,3,9,1,7,9};
  int sum=0;
  int num=arr.length;
  for(int i=0;i<num;i++)
  {
    sum=sum+arr[i];
  }
  double avrage=(double)sum/num;
  System.out.println(avrage);
 }
}  