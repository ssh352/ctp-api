package com.guotaian;

import java.io.UnsupportedEncodingException;

import com.gta.qts.c2j.adaptee.IGTAQTSCallbackBase;
import com.gta.qts.c2j.adaptee.structure.CFFEXL2_Quotation;
import com.gta.qts.c2j.adaptee.structure.CFFEXL2_Static;
import com.gta.qts.c2j.adaptee.structure.CZCEL1_Quotation;
import com.gta.qts.c2j.adaptee.structure.CZCEL1_Static;
import com.gta.qts.c2j.adaptee.structure.DCEL1_ArbiQuotation;
import com.gta.qts.c2j.adaptee.structure.DCEL1_Quotation;
import com.gta.qts.c2j.adaptee.structure.DCEL1_Static;
import com.gta.qts.c2j.adaptee.structure.DCEL2_ArbiQuotation;
import com.gta.qts.c2j.adaptee.structure.DCEL2_MarchPriceQty;
import com.gta.qts.c2j.adaptee.structure.DCEL2_OrderStatistic;
import com.gta.qts.c2j.adaptee.structure.DCEL2_Quotation;
import com.gta.qts.c2j.adaptee.structure.DCEL2_RealTimePrice;
import com.gta.qts.c2j.adaptee.structure.DCEL2_Static;
import com.gta.qts.c2j.adaptee.structure.ESUNNY_Index;
import com.gta.qts.c2j.adaptee.structure.HKEXL2_BrokerQueue;
import com.gta.qts.c2j.adaptee.structure.HKEXL2_Index;
import com.gta.qts.c2j.adaptee.structure.HKEXL2_Overview;
import com.gta.qts.c2j.adaptee.structure.HKEXL2_Quotation;
import com.gta.qts.c2j.adaptee.structure.HKEXL2_Static;
import com.gta.qts.c2j.adaptee.structure.SHFEL1_Quotation;
import com.gta.qts.c2j.adaptee.structure.SHFEL1_Static;
import com.gta.qts.c2j.adaptee.structure.SSEIOL1_Quotation;
import com.gta.qts.c2j.adaptee.structure.SSEIOL1_Static;
import com.gta.qts.c2j.adaptee.structure.SSEL1_Quotation;
import com.gta.qts.c2j.adaptee.structure.SSEL1_Static;
import com.gta.qts.c2j.adaptee.structure.SSEL2_Auction;
import com.gta.qts.c2j.adaptee.structure.SSEL2_Index;
import com.gta.qts.c2j.adaptee.structure.SSEL2_Overview;
import com.gta.qts.c2j.adaptee.structure.SSEL2_Quotation;
import com.gta.qts.c2j.adaptee.structure.SSEL2_Static;
import com.gta.qts.c2j.adaptee.structure.SSEL2_Transaction;
import com.gta.qts.c2j.adaptee.structure.SSE_IndexPress;
import com.gta.qts.c2j.adaptee.structure.SZSEL1_Bulletin;
import com.gta.qts.c2j.adaptee.structure.SZSEL1_Quotation;
import com.gta.qts.c2j.adaptee.structure.SZSEL1_Static;
import com.gta.qts.c2j.adaptee.structure.SZSEL2_Index;
import com.gta.qts.c2j.adaptee.structure.SZSEL2_Order;
import com.gta.qts.c2j.adaptee.structure.SZSEL2_Quotation;
import com.gta.qts.c2j.adaptee.structure.SZSEL2_Static;
import com.gta.qts.c2j.adaptee.structure.SZSEL2_Status;
import com.gta.qts.c2j.adaptee.structure.SZSEL2_Transaction;

/**
 * 订阅消息数据回调接口
 * */
public class GTACallbackBase implements IGTAQTSCallbackBase {
    
    private GuotaianGUI guotaian;
    
    public GTACallbackBase(GuotaianGUI guotaian) {
        this.guotaian = guotaian;
    }
    
    public GTACallbackBase(){
        
    }

    @Override
    public void OnConnectionState(int msgType, int errCode) {
        System.out.println("OnConnectionState  msgType:" + msgType + " errCode:" + errCode);
        //guotaian.textArea.append("OnConnectionState  msgType:" + msgType + " errCode:" + errCode + "\n\r");
    }

    @Override
    public void OnLoginState(int errCode) {

    }

    @Override
    public void OnSubscribe_SSEL1_Static(SSEL1_Static data) {

    }

    @Override
    public void OnSubscribe_SSEL1_Quotation(SSEL1_Quotation data) {

    }

    @Override
    public void OnSubscribe_SSE_IndexPress(SSE_IndexPress data) {

    }
    
    @Override
    public void OnSubscribe_SSEIOL1_Quotation(SSEIOL1_Quotation data) {

    }

    @Override
    public void OnSubscribe_SSEIOL1_Static(SSEIOL1_Static data) {

    }

    @Override
    public void OnSubscribe_SSEL2_Auction(SSEL2_Auction data) {

    }

    @Override
    public void OnSubscribe_SSEL2_Index(SSEL2_Index data) {

    }

    @Override
    public void OnSubscribe_SSEL2_Overview(SSEL2_Overview data) {

    }

    @Override
    public void OnSubscribe_SSEL2_Quotation(SSEL2_Quotation data) {
    }

    @Override
    public void OnSubscribe_SSEL2_Static(SSEL2_Static data) {

    }

    @Override
    public void OnSubscribe_SSEL2_Transaction(SSEL2_Transaction data) {

    }

    @Override
    public void OnSubscribe_SZSEL2_Index(SZSEL2_Index data) {

    }

    @Override
    public void OnSubscribe_SZSEL2_Order(SZSEL2_Order data) {

    }

    @Override
    public void OnSubscribe_SZSEL2_Quotation(SZSEL2_Quotation data) {
        //System.out.println("OnSubscribe_SZSEL2_Quotation");
        SZSEL2_Quotation_FileOut.printData(data);
    }

    @Override
    public void OnSubscribe_SZSEL2_Static(SZSEL2_Static data) {

    }

    @Override
    public void OnSubscribe_SZSEL2_Status(SZSEL2_Status data) {

    }

    @Override
    public void OnSubscribe_SZSEL2_Transaction(SZSEL2_Transaction data) {
        //System.out.println("OnSubscribe_SZSEL2_Transaction");
        SZSEL2_Transaction_FileOut.printData(data);
    }

    @Override
    public void OnSubscribe_SZSEL1_Bulletin(SZSEL1_Bulletin arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void OnSubscribe_SZSEL1_Quotation(SZSEL1_Quotation arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void OnSubscribe_SZSEL1_Static(SZSEL1_Static arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void OnSubscribe_CFFEXL2_Static(CFFEXL2_Static data) {

    }
    
    @Override
    public void OnSubscribe_CFFEXL2_Quotation(CFFEXL2_Quotation data) {

    }

    @Override
    public void OnSubscribe_SHFEL1_Static(SHFEL1_Static data) {

    }

    @Override
    public void OnSubscribe_SHFEL1_Quotation(SHFEL1_Quotation data) {
        if(guotaian != null){
            try {
                guotaian.textArea.append(new String(data.Symbol,"UTF-8").replace(" ", "") + " " +data.LastPrice + "\n\r");
                guotaian.textArea.setCaretPosition(guotaian.textArea.getText().length()); 
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else {
            System.out.println(String.valueOf(data.Symbol) + " " +data.LastPrice);
        }
    }

	@Override
	public void OnSubscribe_CZCEL1_Quotation(CZCEL1_Quotation arg0) {
	    if(guotaian != null){
            try {
                guotaian.textArea_1.append(new String(arg0.Symbol,"UTF-8").replace(" ", "") + " " +arg0.LastPrice + "\n\r");
                guotaian.textArea_1.setCaretPosition(guotaian.textArea_1.getText().length()); 
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else {
            System.out.println(String.valueOf(arg0.Symbol) + " " +arg0.LastPrice);
        }
		
	}

	@Override
	public void OnSubscribe_CZCEL1_Static(CZCEL1_Static arg0) {
		
		
	}

	@Override
	public void OnSubscribe_DCEL1_ArbiQuotation(DCEL1_ArbiQuotation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_DCEL1_Quotation(DCEL1_Quotation arg0) {
		
	    if(guotaian != null){
            try {
                guotaian.textArea_2.append(new String(arg0.Symbol,"UTF-8").replace(" ", "") + " " +arg0.LastPrice + "\n\r");
                guotaian.textArea_2.setCaretPosition(guotaian.textArea_2.getText().length()); 
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else {
            System.out.println(String.valueOf(arg0.Symbol) + " " +arg0.LastPrice);
        }
	}

	@Override
	public void OnSubscribe_DCEL1_Static(DCEL1_Static arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_DCEL2_ArbiQuotation(DCEL2_ArbiQuotation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_DCEL2_MarchPriceQty(DCEL2_MarchPriceQty arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_DCEL2_OrderStatistic(DCEL2_OrderStatistic arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_DCEL2_Quotation(DCEL2_Quotation arg0) {
	    if(guotaian != null){
            try {
                guotaian.textArea_3.append(new String(arg0.Symbol,"UTF-8").replace(" ", "") + " " +arg0.LastPrice + "\n\r");
                guotaian.textArea_3.setCaretPosition(guotaian.textArea_3.getText().length()); 
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else {
            System.out.println(String.valueOf(arg0.Symbol) + " " +arg0.LastPrice);
        }
		
	}

	@Override
	public void OnSubscribe_DCEL2_RealTimePrice(DCEL2_RealTimePrice arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_DCEL2_Static(DCEL2_Static arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_ESUNNY_Index(ESUNNY_Index arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_HKEXL2_BrokerQueue(HKEXL2_BrokerQueue arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_HKEXL2_Index(HKEXL2_Index arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_HKEXL2_Overview(HKEXL2_Overview arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_HKEXL2_Quotation(HKEXL2_Quotation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OnSubscribe_HKEXL2_Static(HKEXL2_Static arg0) {
		// TODO Auto-generated method stub
		
	}
}