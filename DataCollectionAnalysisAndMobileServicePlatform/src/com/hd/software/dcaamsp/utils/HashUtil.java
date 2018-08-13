package com.hd.software.dcaamsp.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class HashUtil {
	public static void main(String[] args) {
        String hashAlgorithmName = "MD5";
        String credentials = "admin";
        int hashIterations = 1;
        ByteSource credentialsSalt = ByteSource.Util.bytes("acacjyvv");
        Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
        System.out.println(obj);
    }
}
