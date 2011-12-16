package org.radargun.cachewrappers;

import org.radargun.CacheWrapper;
import org.radargun.utils.TypedProperties;

import java.util.concurrent.ConcurrentHashMap;

public class ChmWrapper implements CacheWrapper {

   public final ConcurrentHashMap chm = new ConcurrentHashMap();

   @Override
   public void setUp(String configuration, boolean isLocal, int nodeIndex, TypedProperties confAttributes) throws Exception {
   }

   public void tearDown() throws Exception {
   }

   @Override
   public void put(String bucket, Object key, Object value) throws Exception {
      chm.put(key, value);
   }

   @Override
   public Object get(String bucket, Object key) throws Exception {
      return chm.get(key);
   }

   @Override
   public void empty() throws Exception {
      chm.clear();
   }

   @Override
   public int getNumMembers() {
      return 1;
   }

   @Override
   public String getInfo() {
      return "Concurrent hash map wrapper";
   }

   @Override
   public Object getReplicatedData(String bucket, String key) throws Exception {
      return null;
   }

   @Override
   public void startTransaction() {
      throw new IllegalStateException("This is not transactional");
   }

   @Override
   public void endTransaction(boolean successful) {
      throw new IllegalStateException("This is not transactional");
   }

   @Override
   public int size() {
      return chm.size();
   }
}
