//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// Related Topics 数组 二分查找 分治 👍 6870 👎 0


package cn.weifeng.leetcode.editor.cn;

public class P4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new P4_MedianOfTwoSortedArrays().new Solution();
        solution.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            // 初始化新数组

            int m = nums1 == null ? 0 : nums1.length;
            int n = nums2 == null ? 0 : nums2.length;

            // m 为空数组
            if (m == 0 && n == 0) {
                return 0.0;
            }

            int[] nums = new int[m + n];
            // nums1 为空数组 返回 num2的中位数
            if (m == 0) {
                // 偶然
                if (n % 2 == 0) {
                    return (nums2[n / 2] + nums2[n / 2 - 1]) / 2.0;
                } else {
                    return nums2[n / 2];
                }
            }

            if (n == 0) {
                // 偶然
                if (m % 2 == 0) {
                    return (nums1[m / 2] + nums1[m / 2 - 1]) / 2.0;
                } else {
                    return nums1[m / 2];
                }
            }

            // 合并数组
            int count = 0;
            int i = 0;
            int j = 0;

            while (count != (m + n)) {
                if (i == m) {
                    while (j < n) {
                        nums[count++] = nums2[j++];
                    }
                    break;
                }
                if (j == n) {
                    while (i < m) {
                        nums[count++] = nums1[i++];
                    }
                    break;
                }
                if (nums1[i] < nums2[j]) {
                    nums[count++] = nums1[i++];
                } else {
                    nums[count++] = nums2[j++];
                }

            }

            if (count % 2 == 0) {
                return (nums[count / 2] + nums[count / 2 - 1]) / 2.0;
            } else {
                return nums[count / 2];
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}