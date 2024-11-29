/*
This program gets the basic information about different GPUs and GPU devices.

 */

package org.example;
import com.nvidia.spark.rapids.tool.A10GGpu$;
import com.nvidia.spark.rapids.tool.GpuDevice$;

public class Main {
    public static void main(String[] args) {

        A10GGpu$ a10gpu = A10GGpu$.MODULE$;
        if (a10gpu != null) {
            System.out.println(a10gpu.productPrefix());
            System.out.println(a10gpu.getInitialPartitionNum());
            System.out.println(a10gpu.getGpuConcTasks());
            System.out.println(a10gpu.getMemory());
        }

        GpuDevice$ gpuDevice = GpuDevice$.MODULE$;
        if(gpuDevice != null) {

            System.out.println(gpuDevice.deviceMap().seq());
            System.out.println(gpuDevice.com$nvidia$spark$rapids$tool$GpuDevice$$DEF_GPU_MEM_PER_TASK_MB());
            System.out.println(gpuDevice.isTraceEnabled());


        }



    }
}