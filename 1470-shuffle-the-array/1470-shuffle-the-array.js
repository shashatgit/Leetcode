/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    let result = new Array();
    let i = 0;
    for (i = 0; i < n; i ++)
    {
        let k = n + i;
        result[2*i] = nums[i];
        result[2*i+1] = nums[k];
    }
    return result;
};