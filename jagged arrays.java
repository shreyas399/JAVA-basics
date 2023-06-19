class array
{
    public static void main(String a[])
    {
        int nums [][]= new int[5][];
        nums[0]=new int[5];
        nums[1]=new int[8];
        nums[2]=new int[2];
        nums[3]=new int[1];
        nums[4]=new int[4];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j]);
            }
                System.out.println();
        }

    }
}
