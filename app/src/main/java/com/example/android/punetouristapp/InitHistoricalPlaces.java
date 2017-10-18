package com.example.android.punetouristapp;

import android.content.Context;

import java.util.List;

/**
 * Created by UFO_24 on 10-10-2017.
 */

public class InitHistoricalPlaces {

    public static void initHistPlaces(Context context, List<HistoricalPlace> list) {

        String hist1PlaceName = context.getString(R.string.historical1_name);
        Location hist1Loc = new Location(context.getString(R.string.historical1_location),
                context.getString(R.string.historical1_contact));
        String hist1Arch = context.getString(R.string.historical1_archstyle);
        String hist1Timings = context.getString(R.string.historical1_timings);
        String hist1Built = context.getString(R.string.historical1_year);
        String hist1Desc = context.getString(R.string.historical1_desc);
        int hist1ImgRes = R.drawable.historical1_shani;

        list.add(new HistoricalPlace(hist1PlaceName, hist1Loc, hist1Arch, hist1Timings, hist1Built, hist1Desc, hist1ImgRes));

        String hist2PlaceName = context.getString(R.string.historical2_name);
        Location hist2Loc = new Location(context.getString(R.string.historical2_location),
                context.getString(R.string.historical2_contact));
        String hist2Arch = context.getString(R.string.historical2_archstyle);
        String hist2Timings = context.getString(R.string.historical2_timings);
        String hist2Built = context.getString(R.string.historical2_year);
        String hist2Desc = context.getString(R.string.historical2_desc);
        int hist2ImgRes = R.drawable.historical2_karla;

        list.add(new HistoricalPlace(hist2PlaceName, hist2Loc, hist2Arch, hist2Timings, hist2Built, hist2Desc, hist2ImgRes));

        String hist3PlaceName = context.getString(R.string.historical3_name);
        Location hist3Loc = new Location(context.getString(R.string.historical3_location),
                context.getString(R.string.historical3_contact));
        String hist3Arch = context.getString(R.string.historical3_archstyle);
        String hist3Timings = context.getString(R.string.historical3_timings);
        String hist3Built = context.getString(R.string.historical3_year);
        String hist3Desc = context.getString(R.string.historical3_desc);
        int hist3ImgRes = R.drawable.historical3_logarh;

        list.add(new HistoricalPlace(hist3PlaceName, hist3Loc, hist3Arch, hist3Timings, hist3Built, hist3Desc, hist3ImgRes));

        String hist4PlaceName = context.getString(R.string.historical4_name);
        Location hist4Loc = new Location(context.getString(R.string.historical4_location),
                context.getString(R.string.historical4_contact));
        String hist4Arch = context.getString(R.string.historical4_archstyle);
        String hist4Timings = context.getString(R.string.historical4_timings);
        String hist4Built = context.getString(R.string.historical4_year);
        String hist4Desc = context.getString(R.string.historical4_desc);
        int hist4ImgRes = R.drawable.historical4_sinhgad;

        list.add(new HistoricalPlace(hist4PlaceName, hist4Loc, hist4Arch, hist4Timings, hist4Built, hist4Desc, hist4ImgRes));

        String hist5PlaceName = context.getString(R.string.historical5_name);
        Location hist5Loc = new Location(context.getString(R.string.historical5_location),
                context.getString(R.string.historical5_contact));
        String hist5Arch = context.getString(R.string.historical5_archstyle);
        String hist5Timings = context.getString(R.string.historical5_timings);
        String hist5Built = context.getString(R.string.historical5_year);
        String hist5Desc = context.getString(R.string.historical5_desc);
        int hist5ImgRes = R.drawable.historical5_patal;

        list.add(new HistoricalPlace(hist5PlaceName, hist5Loc, hist5Arch, hist5Timings, hist5Built, hist5Desc, hist5ImgRes));

    }
}
