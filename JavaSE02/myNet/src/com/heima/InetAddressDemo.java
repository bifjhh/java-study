package com.heima;

import java.net.*;

/**
 * InetAddress: 此类表示互联网协议 (IP) 地址。
 *
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        System.out.println( InetAddress.getLocalHost() );
//        sunkundeMacBook-Pro.local/169.254.242.246
        InetAddress address = InetAddress.getByName( "169.254.242.246" );

//        System.out.println( InetAddress.getByName( "169.254.242.246" ) );
//        System.out.println( InetAddress.getByName( "sunkundeMacBook-Pro.local" ) );
        System.out.println( address.getHostName() );
        System.out.println( address.getHostAddress() );

    }
}
