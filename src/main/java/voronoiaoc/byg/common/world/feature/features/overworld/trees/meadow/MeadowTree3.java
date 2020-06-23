package voronoiaoc.byg.common.world.feature.features.overworld.trees.meadow;

import com.mojang.serialization.Codec;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import voronoiaoc.byg.common.world.feature.features.overworld.trees.util.BYGAbstractTreeFeature;

import java.util.Random;
import java.util.Set;

public class MeadowTree3 extends BYGAbstractTreeFeature<DefaultFeatureConfig> {

    public MeadowTree3(Codec<DefaultFeatureConfig> configIn) {
        super(configIn);
    }

    protected boolean place(Set<BlockPos> changedBlocks, ServerWorldAccess worldIn, Random rand, BlockPos pos, BlockBox boundsIn) {
        int randTreeHeight = 4 + rand.nextInt(5);
        BlockPos.Mutable mainmutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getDimensionHeight()) {
            BlockPos blockpos = pos.down();
            if (!isDesiredGround(worldIn, blockpos, Blocks.GRASS_BLOCK)) {
                return false;
            } else if (!this.doesTreeFit(worldIn, pos, randTreeHeight)) {
                return false;
            } else {
                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    this.treeLog(changedBlocks, worldIn, mainmutable, boundsIn);

                    mainmutable.move(Direction.UP);
                }
                mainmutable.set(pos);
                
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 1, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 1, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 1, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 2, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 2, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 2, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 2, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 3, -3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 3, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 3, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 3, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 3, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 3, 3), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, -4), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 4, -1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 4, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 4, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 4, 4), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 5, -4), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 5, -2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 5, 0), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 1), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 5, 2), boundsIn);
                this.treeBranch(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 1, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 1, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 2, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 2, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 2, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 2, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 2, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 2, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 2, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 2, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 2, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 2, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 2, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 2, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 2, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 3, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 3, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 3, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 3, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 3, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 3, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 3, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 3, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 3, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 3, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 3, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 3, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 3, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 3, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 3, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 3, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 3, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 3, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 3, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 3, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 3, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 3, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 4, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 4, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 4, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 4, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 4, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 4, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 4, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 4, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 4, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 4, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 4, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(7,randTreeHeight + 4, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(7,randTreeHeight + 4, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 4, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 4, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 4, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 4, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 4, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 4, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 4, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 4, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 4, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 4, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 4, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 4, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 4, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 5, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, -6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, -5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 5, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 5, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 5, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(7,randTreeHeight + 5, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(7,randTreeHeight + 5, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 5, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 5, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 5, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 5, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 5, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 5, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 5, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 5, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 5, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 5, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 5, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 5, 7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 5, 7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 6, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 6, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 6, -4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 6, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 6, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(7,randTreeHeight + 6, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(7,randTreeHeight + 6, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-6,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 6, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 6, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 6, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 6, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 6, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 6, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 6, 4), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 6, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 6, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 6, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 6, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 6, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 6, 7), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(2,randTreeHeight + 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 7, -3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(3,randTreeHeight + 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 7, -2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-2,randTreeHeight + 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 7, -1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-1,randTreeHeight + 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(6,randTreeHeight + 7, 0), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(4,randTreeHeight + 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(5,randTreeHeight + 7, 1), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 7, 2), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(0,randTreeHeight + 7, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(1,randTreeHeight + 7, 3), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 7, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 7, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-3,randTreeHeight + 7, 5), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-5,randTreeHeight + 7, 6), boundsIn);
                this.leafs(changedBlocks, worldIn, mainmutable.add(-4,randTreeHeight + 7, 6), boundsIn);
            }
        }
        return true;
    }

    //Log Placement
    private void treeLog(Set<BlockPos> setlogblock, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, Blocks.DARK_OAK_LOG.getDefaultState(), boundingBox);
        }
    }

    //Log Placement
    private void treeBranch(Set<BlockPos> setlogblock, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        if (canTreePlaceHere(reader, pos)) {
            this.setFinalBlockState(setlogblock, reader, pos, Blocks.DARK_OAK_LOG.getDefaultState(), boundingBox);
        }
    }

    //Leaves Placement
    private void leafs(Set<BlockPos> blockPos, ServerWorldAccess reader, BlockPos pos, BlockBox boundingBox) {
        BlockPos.Mutable blockpos = new BlockPos.Mutable().set(pos);
        if (isAir(reader, blockpos)) {
            this.setFinalBlockState(blockPos, reader, blockpos,  Blocks.BIRCH_LEAVES.getDefaultState(), boundingBox);
        }
    }



    private boolean doesTreeFit(TestableWorld reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable pos = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 2;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canTreePlaceHere(reader, pos.set(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}