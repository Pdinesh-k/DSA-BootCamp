def SelectionSort(arr):
    for i in range(len(arr)):
        lastIndex = (len(arr)-i-1)
        large = arr.index(max(arr[:lastIndex + 1]))
        temp = arr[large]
        arr[large] = arr[lastIndex]
        arr[lastIndex] = temp

print("enter the values for the array seperated with commas")
arr=[int(s) for s in input().split(",")]
SelectionSort(arr)

print("Sorted array : ")
print(arr)