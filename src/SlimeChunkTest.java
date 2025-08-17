import java.util.Random;

public class SlimeChunkTest {
    public static boolean isSlimeChunk(long worldSeed,     // 世界种子，一个64位整数，可以通过/seed获取
                                       int  chunkX,        // 区块X轴坐标，32位整数
                                       int  chunkZ) {      // 区块Z轴坐标，32位整数
        Random rng = new Random(
                worldSeed +
                        (long)(chunkX * chunkX * 4987142) +
                        (long)(chunkX * 5947611) +
                        (long)(chunkZ * chunkZ) * 4392871L +
                        (long)(chunkZ * 389711) ^ 987234911L
        );
        return rng.nextInt(10) == 0;
    }

//    史莱姆数量58
//    区块坐标-859,1303
//    方块坐标-13744,20848
    public static void main(String[] args) {
        long worldSeed = 2277284842347939655L;
        int[][] arr = new int[16][16];
        int chunkX;
        int chunkZ = 1303;
        for(int Z = 0; Z < 16; Z++) {
            System.out.println();
            chunkX = -859;
            for(int X = 0; X < 16; X++) {
                if(isSlimeChunk(worldSeed, chunkX, chunkZ)){
                    arr[Z][X] = 1;
                }else {
                    arr[Z][X] = 0;
                }
                System.out.print(arr[Z][X] + "  ");
                chunkX = chunkX + 1;
            }
            chunkZ = chunkZ + 1;
        }
//        System.out.println(Arrays.deepToString(arr));
        int num1 = 0;
        for(int X = 0; X < 16; X++) {
            for(int Z = 0; Z < 16; Z++) {
                if(arr[Z][X] == 1) {
                    num1 += 1;
                }
            }
        }
        System.out.println();
        System.out.println(num1);
    }
}
