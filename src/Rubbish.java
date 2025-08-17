import java.util.Random;

public class Rubbish {
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

    public static void main(String[] args) {
        long worldSeed = 2277284842347939655L;
        int chunkX = -854;
        int chunkZ = 1303;
        System.out.println(isSlimeChunk(worldSeed, chunkX, chunkZ));
    }
}
