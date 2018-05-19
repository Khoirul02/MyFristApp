package com.anita.myfristapp;

import com.TiketPesawatModel;

import java.util.ArrayList;

/**
 * Created by 7 on 19/05/2018.
 */

public class DataTiketPesawat {
    public static String[][] dataList = new String[][]{
            {"GARUDA", "https://travelspromo.com/wp-content/uploads/2014/07/Garuda-Indonesia.jpg"},
            {"LION", "https://cdn0-a.production.images.static6.com/gw4jD5g2NnGhEsX7WaLWDiu9AS8=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/liputan6-media-production/medias/1639171/original/060174100_1499152513-Foto_Liputan6.jpg"},
            {"CITILINK", "http://sta.nusatrip.net/cmsimg/17/17/citilink-plane.jpg"},
            {"BATIK", "http://cdn2.tstatic.net/tribunnews/foto/bank/images/airbus-a320-batik-air_20160512_020428.jpg"}
    };

    public static ArrayList<TiketPesawatModel> getTiketPesawat(){
        TiketPesawatModel pesawatModel = null;
        ArrayList<TiketPesawatModel> list = new ArrayList<>();

        for (int i=0; i <dataList.length; i++){
            pesawatModel=new TiketPesawatModel();
            pesawatModel.setNama(dataList[i][0]);
            pesawatModel.setFoto(dataList[i][1]);

            list.add(pesawatModel);
        }
        return list;
    }
}
