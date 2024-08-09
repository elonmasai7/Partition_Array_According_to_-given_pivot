class Solution {
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val lessThanPivot = mutableListOf<Int>()
        val equalToPivot = mutableListOf<Int>()
        val greaterThanPivot = mutableListOf<Int>()

        for (num in nums) {
            when{
                num < pivot -> lessThanPivot.add(num)
                num == pivot -> equalToPivot.add(num)
                else -> greaterThanPivot.add(num)
            }
        }
        return (lessThanPivot + equalToPivot + greaterThanPivot).toIntArray()

        
    }
} 
fun main() {
    val solution = Solution()

    val nums1 = intArrayOf(9, 12, 5, 10, 14, 3, 10)
    val pivot1 = 10
    println(solution.pivotArray(nums1, pivot1).joinToString("' "))

    val nums2 = intArrayOf(-3, 4, 3, 2)
    val pivot2 = 2
    println(solution.pivotArray(nums2, pivot2).joinToString(", "))
}
