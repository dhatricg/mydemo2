package com.cg.HarshWardhan;


/*public static List<Integer> getRegions(List<String> ip_addresses) {
    List<Integer> regions = new ArrayList<>();
    for (String ip : ip_addresses) {
        regions.add(getRegion(ip));
    }
    return regions;
}
 
private static int getRegion(String ip) {
    // First validate the IP format
    if (!isValidIPFormat(ip)) {
        return -1;
    }
    // Split the IP address into octets
    String[] octets = ip.split("\\.");
    // Convert first octet to integer
    int firstOctet;
    try {
        firstOctet = Integer.parseInt(octets[0]);
    } catch (NumberFormatException e) {
        return -1;
    }
    // Validate all octets are within valid range (0-255)
    for (String octet : octets) {
        try {
            int value = Integer.parseInt(octet);
            if (value < 0 || value > 255) {
                return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    // Determine region based on first octet
    if (firstOctet >= 0 && firstOctet <= 127) {
        return 1;
    } else if (firstOctet >= 128 && firstOctet <= 191) {
        return 2;
    } else if (firstOctet >= 192 && firstOctet <= 223) {
        return 3;
    } else if (firstOctet >= 224 && firstOctet <= 239) {
        return 4;
    } else if (firstOctet >= 240 && firstOctet <= 255) {
        return 5;
    }
    return -1;
}
 
private static boolean isValidIPFormat(String ip) {
    // Check if IP is null or empty
    if (ip == null || ip.isEmpty()) {
        return false;
    }
    // Split the IP address by dots
    String[] parts = ip.split("\\.");
    // Check if we have exactly 4 parts
    if (parts.length != 4) {
        return false;
    }
    // Check if any part is empty
    for (String part : parts) {
        if (part.isEmpty()) {
            return false;
        }
        // Check for leading zeros
        if (part.length() > 1 && part.startsWith("0")) {
            return false;
        }
    }
    return true;
}*/

//Implement a prototype service to detect a user's location based on their IP addresses.
//The IP addresses belonging to the IPv4 space are conventionally represented by four octets
//"a.b.c.d" - such as 127.10.20.30.
//To keep it simple, these addresses are classified into 5 different regions indexed from 1 to 5 on the basis of the order of the bits in the first octet.
//Broadly, the IP Addresses are categorized as follows:

//1)0.0.0.0 - 127.255.255.255
//2)128.0.0.0 - 191.255.255.255
//3)192.0.0.0 - 223.255.255.255
//4)224.0.0.0 - 239.255.255.255
//5)240.0.0.0 - 255.255.255.255
//Given a list of Strings, ip_addresses, of size n, representing possible IPv4 addresses, for each address, determine if it is a valid IP or not, and classify it into one of the 5 classes.
//Return an array of n integers that represent the index of the regions of the regions for the corresponding IP addresses.
//Represent an invalid IP as -1.
//Function Description:
//Complete the function getRegions in the editor below.
//getRegions has the following parameter:
//string ip_addresses[n]: the list of possible IPv4 addresses
//Returns:
//int[n]:the regions of the IP addresses or -1 if the IP is invalid.
//Constraints:
//1<=n<=10^3
//7<=size(ip_addresses)<=15
//Sample Input:
//3
//123.211.102.13
//271.142.67.142
//225.217.132.58
//Sample Output:
//1
//-1
//4