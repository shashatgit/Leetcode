/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {

     function bblSort(arr)
      {
            for (var i = 0; i < arr.length; i++)
             {
                for (var j = 0; j < (arr.length - i - 1); j++) 
                {
                     if (arr[j] > arr[j + 1]) 
                     {
                        var temp = arr[j]
                         arr[j] = arr[j + 1]
                         arr[j + 1] = temp
                     }
                 }
            }
      }

    let nums3 = nums1.concat(nums2);
    
    bblSort(nums3);

    let ans = 0.00;
    let len = nums3.length;

    if (nums3.length%2 != 0)
    {
       ans = nums3[Math.ceil((len-1)/2)]
       return ans

    }
    else 
    {
        ans = (nums3[Math.ceil((len-1)/2)] + nums3[Math.floor((len-1)/2)] ) / 2
        return ans
    }
};