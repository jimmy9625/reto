package com.co.applitools.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class DashboarPage {


    public static final  Target NAME = Target.the("label user name ").locatedBy("//*[@id='logged-user-name-new']");
    public static final Target TOTAL_BALACE = Target.the("label total balance").locatedBy("//*[@id='totalBalance']/div[@class='balance-value']/span[1]");
    public static final Target  CREDIT_AVAILABLE = Target.the("label credit available").locatedBy("//*[@id='creditAvailable']//div[@class='balance-value']");
    public static final  Target AMOUNT = Target.the("list amount").locatedBy("//td[@class='text-right bolder nowrap']/span");
}
