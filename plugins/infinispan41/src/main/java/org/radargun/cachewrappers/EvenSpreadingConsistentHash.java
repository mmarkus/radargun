package org.radargun.cachewrappers;

import org.infinispan.distribution.ConsistentHash;
import org.infinispan.remoting.transport.Address;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author Mircea.Markus@jboss.com
 */
public class EvenSpreadingConsistentHash implements ConsistentHash {

   @Override
   public void setCaches(List<Address> addresses) {
      // TODO: Customise this generated block
   }

   @Override
   public List<Address> getCaches() {
      return null;  // TODO: Customise this generated block
   }

   @Override
   public List<Address> locate(Object o, int i) {
      return null;  // TODO: Customise this generated block
   }

   @Override
   public Map<Object, List<Address>> locateAll(Collection<Object> objects, int i) {
      return null;  // TODO: Customise this generated block
   }

   @Override
   public int getDistance(Address address, Address address1) {
      return 0;  // TODO: Customise this generated block
   }

   @Override
   public boolean isAdjacent(Address address, Address address1) {
      return false;  // TODO: Customise this generated block
   }

   @Override
   public boolean isKeyLocalToAddress(Address address, Object o, int i) {
      return false;  // TODO: Customise this generated block
   }

   @Override
   public int getHashId(Address address) {
      return 0;  // TODO: Customise this generated block
   }

   @Override
   public int getHashSpace() {
      return 0;  // TODO: Customise this generated block
   }
}
