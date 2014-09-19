package com.intel.sto.bigdata.dew.master;

import java.util.UUID;

import akka.actor.UntypedActor;

import com.intel.sto.bigdata.dew.message.AgentInfo;

public class Master extends UntypedActor {
  @Override
  public void onReceive(Object message) throws Exception {
    if (message instanceof AgentInfo) {

      AgentInfo ai = (AgentInfo) message;
      ai.setUrl(getSender().path().toString());
      ClusterState.addAgent(UUID.randomUUID().toString(), ai);

      System.out.println("Agent registered." + getSender().path());
    } else if (message instanceof String) {
      System.out.println("fff:" + getSender().path());
    } else {
      System.out.println("fff");
      unhandled(message);
    }

  }
}