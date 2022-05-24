#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[n+1];

    for(int i=0;i<n;i++)
    cin>>a[i];

    for(int i=0;i<n-1;i++)
    {
        // int temp = a[i];
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
    }

    for(int i=0;i<n;i++)
    cout<<a[i]<<" ";

}