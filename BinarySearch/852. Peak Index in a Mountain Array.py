class Solution(object):
    def peakIndexInMountainArray(self, arr):
        start = 0
        end = len(arr)-1
        while(start<=end):
            mid = start+(end-start)//2
            if arr[mid] > arr[mid + 1] and arr[mid] > arr[mid - 1]:
                return mid
            elif arr[mid] < arr[mid + 1]:
                start = mid+1
            else:
                end=mid-1
arr=[]
solution=Solution()
Result = solution.peakIndexInMountainArray(arr)
print(Result)