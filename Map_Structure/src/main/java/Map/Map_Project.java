package Map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * JAVA8 实现实现List转map 、分组、过滤等
 */
public class Map_Project {
    public static void main(String[] args) {
        List<Map_data> mapData = new ArrayList<>();
        Map_data mapData1 = new Map_data(1,"李白", new BigDecimal(2.15),10);
        Map_data mapData2 = new Map_data(1,"杜甫", new BigDecimal(3.25),20);
        Map_data mapData3 = new Map_data(2,"韩愈", new BigDecimal(4.15),40);
        Map_data mapData4 = new Map_data(3,"白居易", new BigDecimal(5.15),10);
        mapData.add(mapData1);
        mapData.add(mapData2);
        mapData.add(mapData3);
        mapData.add(mapData4);
        /**
         * 以对象的某个属性分组
         */
        Map<Integer,List<Map_data>> listMap = mapData.stream().collect(Collectors.groupingBy(Map_data::getId));

        System.out.println(listMap);
        /**
         * List转map,如果集合有重复key报错,去除(k1,k2)->k1
         */
        Map<Integer,Map_data> ListToMap  = mapData.stream().collect(Collectors.toMap(Map_data::getId,a->a,(k1,k2)->k1));
        System.out.println(ListToMap);
        /**
         * 过滤符合条件的元素
         */





    }






}
