#include<iostream>

using namespace std;

void print(int *a,int);
void swap(int a[],int,int);
int partition(int a[],int,int);
void quicksort(int a[],int,int);

void print(int *a,int n)
{
    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";
    
}
void swap(int a[],int i,int j)
{
    int temp = a[i];
    a[i] = a[j];
    a[j]= temp;

}
int partition(int a[],int low,int high)
{
    int pivot = a[low];
    int i = low+1;
    int j = high;

    while(i<j)
    {
        while(a[i]<=pivot) i++;
        while(a[j]>pivot) j--;
        if(i<j)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

    }

    // swap(j,low);
    int temp = a[j];
    a[j] = a[low];
    a[low] = temp;
    return j;
} 

void quicksort(int a[],int l,int h)
{
    if(l<h)
    {
        int pivot = partition(a,l,h);
        cout<<pivot<<endl;
        
        quicksort(a,l,pivot-1);
        quicksort(a,pivot+1,h);

    }
}

int main()
{
    int n;
    cin>>n;
    int a[10000];
    
    for(int i=0;i<n;i++)
    cin>>a[i];

    // print(a,n);
    quicksort(a,0,n-1);
    print(a,n);
    

}