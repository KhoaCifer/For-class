#include <iostream>

using namespace std;

void inputArr(int arr[],int max){
	int i;
	for (i = 0; i < max; i++){
		cout<<"Input arr["<<i<<"]";
		cin>>arr[i];
	}
}

void linearSearch(int arr[], int max, int value) {
	for (int i = 0; i < max; i++) {
		if (arr[i] == value) {
			cout<<"The position of value is: "<<i<<endl;
		}
	}
}

void binarySearch(int arr[], int max, int value) {
	int i = 0;
	while(i <= max) {
		int mid = i + (max - i) / 2;
		if(arr[mid] == value) {
			cout<<"The position of value is: "<<mid<<endl;
			break;
		}
		else if (arr[mid] < value) {
			i = mid + 1;
		}
		else if (arr[mid] > value) {
			max = mid - 1;
		}
	}
}
int main(){
	int max, choose, value;
	cout<<"Enter max array: ";
	cin>>max;
	int arr[max];
	inputArr(arr, max);
	cout<<"Enter value: ";
	cin>>value;
	cout<<"Enter type of searching: "<<endl<<"1. Linear Search"<<endl<<"2. Binary Search\n";
	cin>>choose;
	switch(choose){
		case 1:
			linearSearch(arr, max, value);
			break;
		case 2:
			binarySearch(arr, max, value);
			break;
	}
	return 0;
}
