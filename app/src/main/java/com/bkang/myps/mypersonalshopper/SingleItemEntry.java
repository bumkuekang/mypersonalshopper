package com.bkang.myps.mypersonalshopper;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016-01-23.
 */
public class SingleItemEntry {
    private int mItemID;
    private ArrayList mItemAlbumID;
    private int mItemCategory;
    private String mItemName;
    private String mItemBrand;
    private double mItemPrice;
    private String mItemDescription;

    public SingleItemEntry() {
        mItemID = 0;
        mItemAlbumID = new ArrayList();
        mItemCategory = 0;
        mItemName = "No Name Entered";
        mItemBrand = "Not a Luxury brand";
        mItemPrice = 1.99;
        mItemDescription = "Please enter description...";
    }

    public SingleItemEntry(int aItemID, String aItemName, String aItemBrand, double aItemPrice, String aItemDescription) {
        mItemID = aItemID;
        mItemAlbumID = new ArrayList();
        mItemCategory = 0;
        mItemName = aItemName;
        mItemBrand = aItemBrand;
        mItemPrice = aItemPrice;
        mItemDescription = aItemDescription;
    }

    public String getItemName(){ return mItemName; }
    public void setItemName(String aItemName){ mItemName = aItemName; }
    public int getItemID(){ return mItemID; }
    public void setItemID(int aItemID){ mItemID = aItemID; }
    public String getItemBrand(){ return mItemBrand; }
    public void setItemBrand(String aItemBrand){ mItemBrand = aItemBrand; }
    public double getItemPrice(){ return mItemPrice; }
    public void setItemPrice(double aItemPrice){ mItemPrice = aItemPrice; }
    public int getItemCategory(){ return mItemCategory; }
    public void setItemPrice(int aItemCategory){ mItemCategory = aItemCategory; }
    public String getItemDescription(){ return mItemDescription; }
    public void setItemDescription(String aItemDescription){ mItemDescription = aItemDescription; }
    public int getFirstAlbumImageID(){
        int vImageID = 0;// need Set it to default "No-Image item ID" Value.
        if ( !mItemAlbumID.isEmpty() ) {
            vImageID = (int) mItemAlbumID.get(0);
            return vImageID;
        } else {
            return vImageID;
        }
    }

}
