/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hdfs.web;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hdfs.protocol.HdfsFileStatus;
import org.apache.hadoop.io.Text;

@InterfaceAudience.Private
public class WebHdfsConstants {
  public static final String HFTP_SCHEME = "hftp";
  public static final Text HFTP_TOKEN_KIND = new Text("HFTP delegation");
  public static final Text HSFTP_TOKEN_KIND = new Text("HSFTP delegation");
  public static final String HSFTP_SCHEME = "hsftp";
  public static final String WEBHDFS_SCHEME = "webhdfs";
  public static final String SWEBHDFS_SCHEME = "swebhdfs";
  public static final Text WEBHDFS_TOKEN_KIND = new Text("WEBHDFS delegation");
  public static final Text SWEBHDFS_TOKEN_KIND = new Text("SWEBHDFS delegation");

  enum PathType {
    FILE, DIRECTORY, SYMLINK;

    static PathType valueOf(HdfsFileStatus status) {
      return status.isDir()? DIRECTORY: status.isSymlink()? SYMLINK: FILE;
    }
  }
}
