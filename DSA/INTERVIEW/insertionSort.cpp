#include<iostream>
using namespace std;

void print(int* a,int);
void insertionSort(int a[],int n);

int main()
{
    int n;
    cin>>n;
    int a[100000];

    for(int i=0;i<n;i++)
    cin>>a[i];

    // print(a,n);
    insertionSort(a,n);
    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
    


}

void insertionSort(int a[],int n)
{
    for(int i=1;i<n;i++)
    {
        int temp = a[i];
        int j = i-1;
        while(j>0 && a[j]>temp)
        {
            a[j+1] = a[j];
            j--;

        }
        a[j+1] =  temp;   
    }
}