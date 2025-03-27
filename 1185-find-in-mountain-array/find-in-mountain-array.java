/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndex(mountainArr);
        int first = search(target, mountainArr, 0, peak);
        if(first!=-1){
            return first;
        }
        int second = search(target, mountainArr, peak+1, mountainArr.length()-1);
        return second;
    }
    public int peakIndex(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length()-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid+1)<mountainArr.get(mid)){
                end = mid;
            }else{
                start = mid+1;
            }      
        }
        return start; 
    }

    public int search(int target, MountainArray mountainArr, int start, int end){
        boolean check = mountainArr.get(start) < mountainArr.get(end);
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(check){
                if(mountainArr.get(mid)>target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(mountainArr.get(mid)<target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            
        }
        return -1;
    }

}