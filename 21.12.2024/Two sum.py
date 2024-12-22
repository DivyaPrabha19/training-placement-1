def i(nums,target):
    for i in range(len(nums)+1):
        for j in range(i + 1, len(nums)):
            if nums[i]+nums[j]==target:
                list.append(lst,i)
                list.append(lst,j)
                print(lst)

nums=[2,7,11,15]
target=9
lst=[]  
i(nums,target)  

Output:
nums =
[2,7,11,15]
target =
9
