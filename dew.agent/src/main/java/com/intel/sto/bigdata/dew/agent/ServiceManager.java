package com.intel.sto.bigdata.dew.agent;

import java.util.HashMap;
import java.util.Map;

import com.intel.sto.bigdata.dew.message.Service;

public class ServiceManager {

  Map<String, Service> serviceMap = new HashMap<String, Service>();

  public void startService(String serviceName) {
    Service service = serviceMap.get(serviceName);
    new Thread(service).start();
  }

  public void stopService(String serviceName) {
  }
}