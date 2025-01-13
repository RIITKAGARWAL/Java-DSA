public class RainWaterTrapped {
    

        public int trap(int[] height) {
            //using two pointer approach
            int idx1= 0; //represents first index
            int idx2 = height.length-1; // represents last index
    
            int leftMax = 0;
            int rightMax = 0;
    
            int maxWaterTrapped = 0;
    
            while(idx1!=idx2){
                if(height[idx1]<=height[idx2]){
                    if(leftMax<=height[idx1]){
                        leftMax = height[idx1];
                    }
                    else{
                        maxWaterTrapped += leftMax-height[idx1];
                    }
                    idx1++;
                }
                else{
                    if(rightMax <= height[idx2]){
                        rightMax = height[idx2];
                    }
                    else{
                        maxWaterTrapped += rightMax - height[idx2];
                    }
                    idx2--;
                }    
            }
            return maxWaterTrapped;
    
    
        }
    }
