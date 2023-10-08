class Solution(object):
    def search(self, nums, target):
        ls=sorted(nums)
        start=0
        end=len(ls)-1
        if(start<=end):
            while(start<=end):
                mid = start+(end-start)//2
                if(target>ls[mid]):
                    start=mid+1
                elif(target<ls[mid]):
                    end=mid-1
                else:
                    x = ls[mid]
                    y = nums.index(x)
                    return y
        return -1
obj=Solution()
x=obj.search(nums=[1,2,3,6,7,8],target=9)
print(x)        