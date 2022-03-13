/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let n= nums.length;
    var indexes=new Array()
    //number[] indexes;
    for(let i=0;i<n;i++){
        for(let j=i+1;j<n;j++){
            if((nums[i]+nums[j]) === target){
                indexes.push(i);
                 indexes.push(j);
            }
        }
    }
    return indexes;
    
    
};