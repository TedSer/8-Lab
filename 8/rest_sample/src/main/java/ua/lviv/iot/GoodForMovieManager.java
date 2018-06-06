package ua.lviv.iot;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class GoodForMovieManager extends GoodForMovie {

    private LinkedList<GoodForMovie> goods = new LinkedList<>();

    //            GoodForMovie equipment = new GoodForMovie();
//            equipment.addGoods(new Lamp("SuperDiod+", 12, 15, 150, "Pioneer"));
//            equipment.addGoods(new Camera("27.pK.pro", "HardBlock1.2",
//                    12, 1500, "LG"));
//            equipment.addGoods(new Microphone("medium", 15, 25, 1, 500, "LG"));
//
//
//    }
    public List<GoodForMovie> sortByPrice() {
        this.goods.sort(Comparator.comparingInt(GoodForMovie::getCost));
        return this.goods;
    }


    public List<GoodForMovie> findByGroup(final BrandType goodsType) {
        List<GoodForMovie> result = new LinkedList<>();
        goods.stream().filter((staff) ->
                ((staff.getBrandType() == goodsType
                ))).forEachOrdered(foundStaff -> {
            result.add(foundStaff);
        });
        return result;
    }

    public void addGoods(final GoodForMovie goods) {
        this.goods.add(goods);
    }

    public LinkedList<GoodForMovie> getGoods() {
        return goods;
    }

    public void setGoods(LinkedList<GoodForMovie> goods) {
        this.goods = goods;
    }
}
