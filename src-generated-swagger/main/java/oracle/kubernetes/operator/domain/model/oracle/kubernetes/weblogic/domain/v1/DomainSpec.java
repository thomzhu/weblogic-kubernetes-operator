/* Copyright (c) 2017, 2018, Oracle and/or its affiliates. All rights reserved. */
/*
 * WebLogicDomain
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package oracle.kubernetes.operator.domain.model.oracle.kubernetes.weblogic.domain.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DomainSpec is a description of a domain.
 */
@ApiModel(description = "DomainSpec is a description of a domain.")

public class DomainSpec {
  @SerializedName("domainUID")
  private String domainUID = null;

  @SerializedName("domainName")
  private String domainName = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imagePullPolicy")
  private String imagePullPolicy = null;

  @SerializedName("adminSecret")
  private io.kubernetes.client.models.V1SecretReference adminSecret = null;

  @SerializedName("asName")
  private String asName = null;

  @SerializedName("asPort")
  private Integer asPort = null;

  @SerializedName("asNodePort")
  private Integer asNodePort = null;

  @SerializedName("asEnv")
  private List<io.kubernetes.client.models.V1EnvVar> asEnv = null;

  @SerializedName("exportT3Channels")
  private List<String> exportT3Channels = null;

  @SerializedName("startupControl")
  private String startupControl = null;

  @SerializedName("serverStartup")
  private List<ServerStartup> serverStartup = null;

  @SerializedName("clusterStartup")
  private List<ClusterStartup> clusterStartup = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  public DomainSpec domainUID(String domainUID) {
    this.domainUID = domainUID;
    return this;
  }

  /**
   * Domain unique identifier. Must be unique across the Kubernetes cluster.
   * 
   * @return domainUID
   **/
  @ApiModelProperty(required = true, value = "Domain unique identifier.  Must be unique across the Kubernetes cluster.")
  public String getDomainUID() {
    return domainUID;
  }

  public void setDomainUID(String domainUID) {
    this.domainUID = domainUID;
  }

  public DomainSpec domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Domain name
   * 
   * @return domainName
   **/
  @ApiModelProperty(required = true, value = "Domain name")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public DomainSpec image(String image) {
    this.image = image;
    return this;
  }

  /**
   * WebLogic Docker image. Defaults to store/oracle/weblogic:12.2.1.3
   * 
   * @return image
   **/
  @ApiModelProperty(value = "WebLogic Docker image.  Defaults to store/oracle/weblogic:12.2.1.3")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public DomainSpec imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if
   * :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More
   * info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   * 
   * @return imagePullPolicy
   **/
  @ApiModelProperty(value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  public DomainSpec adminSecret(io.kubernetes.client.models.V1SecretReference adminSecret) {
    this.adminSecret = adminSecret;
    return this;
  }

  /**
   * Reference to secret containing domain administrator username and password.
   * Secret must contain keys names &#39;username&#39; and &#39;password&#39;
   * 
   * @return adminSecret
   **/
  @ApiModelProperty(required = true, value = "Reference to secret containing domain administrator username and password.  Secret must contain keys names 'username' and 'password'")
  public io.kubernetes.client.models.V1SecretReference getAdminSecret() {
    return adminSecret;
  }

  public void setAdminSecret(io.kubernetes.client.models.V1SecretReference adminSecret) {
    this.adminSecret = adminSecret;
  }

  public DomainSpec asName(String asName) {
    this.asName = asName;
    return this;
  }

  /**
   * Admin server name. Note: Possibly temporary as we could find this value
   * through domain home inspection.
   * 
   * @return asName
   **/
  @ApiModelProperty(required = true, value = "Admin server name.  Note: Possibly temporary as we could find this value through domain home inspection.")
  public String getAsName() {
    return asName;
  }

  public void setAsName(String asName) {
    this.asName = asName;
  }

  public DomainSpec asPort(Integer asPort) {
    this.asPort = asPort;
    return this;
  }

  /**
   * Administration server port. Note: Possibly temporary as we could find this
   * value through domain home inspection.
   * 
   * @return asPort
   **/
  @ApiModelProperty(required = true, value = "Administration server port.  Note: Possibly temporary as we could find this value through domain home inspection.")
  public Integer getAsPort() {
    return asPort;
  }

  public void setAsPort(Integer asPort) {
    this.asPort = asPort;
  }

  public DomainSpec asNodePort(Integer asNodePort) {
    this.asNodePort = asNodePort;
    return this;
  }

  /**
   * Administration server NodePort port. The port on each node on which the
   * administration server will be exposed. If specified, this value must be an
   * unused port. By default, the administration server will not be exposed
   * outside the Kubernetes cluster.
   * 
   * @return asNodePort
   **/
  @ApiModelProperty(value = "Administration server NodePort port.  The port on each node on which the administration server will be exposed.  If specified, this value must be an unused port.  By default, the administration server will not be exposed outside the Kubernetes cluster.")
  public Integer getAsNodePort() {
    return asNodePort;
  }

  public void setAsNodePort(Integer asNodePort) {
    this.asNodePort = asNodePort;
  }

  public DomainSpec asEnv(List<io.kubernetes.client.models.V1EnvVar> asEnv) {
    this.asEnv = asEnv;
    return this;
  }

  public DomainSpec addAsEnvItem(io.kubernetes.client.models.V1EnvVar asEnvItem) {
    if (this.asEnv == null) {
      this.asEnv = new ArrayList<io.kubernetes.client.models.V1EnvVar>();
    }
    this.asEnv.add(asEnvItem);
    return this;
  }

  /**
   * Environment variables for use in starting the administration server.
   * 
   * @return asEnv
   **/
  @ApiModelProperty(value = "Environment variables for use in starting the administration server.")
  public List<io.kubernetes.client.models.V1EnvVar> getAsEnv() {
    return asEnv;
  }

  public void setAsEnv(List<io.kubernetes.client.models.V1EnvVar> asEnv) {
    this.asEnv = asEnv;
  }

  public DomainSpec exportT3Channels(List<String> exportT3Channels) {
    this.exportT3Channels = exportT3Channels;
    return this;
  }

  public DomainSpec addExportT3ChannelsItem(String exportT3ChannelsItem) {
    if (this.exportT3Channels == null) {
      this.exportT3Channels = new ArrayList<String>();
    }
    this.exportT3Channels.add(exportT3ChannelsItem);
    return this;
  }

  /**
   * List of specific T3 channels to export. Named T3 Channels will be exposed
   * using NodePort Services. The internal and external ports must match;
   * therefore, it is required that the channel&#39;s port in the WebLogic
   * configuration be a legal and unique value in the Kubernetes cluster&#39;s
   * legal NodePort port range.
   * 
   * @return exportT3Channels
   **/
  @ApiModelProperty(value = "List of specific T3 channels to export.  Named T3 Channels will be exposed using NodePort Services.  The internal and external ports must match; therefore, it is required that the channel's port in the WebLogic configuration be a legal and unique value in the Kubernetes cluster's legal NodePort port range.")
  public List<String> getExportT3Channels() {
    return exportT3Channels;
  }

  public void setExportT3Channels(List<String> exportT3Channels) {
    this.exportT3Channels = exportT3Channels;
  }

  public DomainSpec startupControl(String startupControl) {
    this.startupControl = startupControl;
    return this;
  }

  /**
   * Controls which managed servers will be started. Legal values are ADMIN, ALL,
   * SPECIFIED or AUTO. Defaults to AUTO. ADMIN indicates that only the
   * administration server is started. ALL indicates that all servers in the
   * domain will be started. SPECIFIED indicates that the administration server is
   * started and then additionally only those servers listed under serverStartup
   * or managed servers belonging to clusters listed under clusterStartup up to
   * the cluster's replicas field will be started. AUTO indicates that servers
   * will be started exactly as with SPECIFIED, but then managed servers belonging
   * to clusters not listed under clusterStartup will be started up to the
   * replicas field.
   * 
   * @return startupControl
   **/
  @ApiModelProperty(value = "Controls which managed servers will be started. Legal values are ADMIN, ALL, SPECIFIED or AUTO.  Defaults to AUTO.  ADMIN indicates that only the administration server is started.  ALL indicates that all servers in the domain will be started.  SPECIFIED indicates that the administration server is started and then additionally only those servers listed under serverStartup or managed servers belonging to clusters listed under clusterStartup up to the cluster's replicas field will be started.  AUTO indicates that servers will be started exactly as with SPECIFIED, but then managed servers belonging to clusters not listed under clusterStartup will be started up to the replicas field.")
  public String getStartupControl() {
    return startupControl;
  }

  public void setStartupControl(String startupControl) {
    this.startupControl = startupControl;
  }

  public DomainSpec serverStartup(List<ServerStartup> serverStartup) {
    this.serverStartup = serverStartup;
    return this;
  }

  public DomainSpec addServerStartupItem(ServerStartup serverStartupItem) {
    if (this.serverStartup == null) {
      this.serverStartup = new ArrayList<ServerStartup>();
    }
    this.serverStartup.add(serverStartupItem);
    return this;
  }

  /**
   * List of server startup details for selected servers.
   * 
   * @return serverStartup
   **/
  @ApiModelProperty(value = "List of server startup details for selected servers.")
  public List<ServerStartup> getServerStartup() {
    return serverStartup;
  }

  public void setServerStartup(List<ServerStartup> serverStartup) {
    this.serverStartup = serverStartup;
  }

  public DomainSpec clusterStartup(List<ClusterStartup> clusterStartup) {
    this.clusterStartup = clusterStartup;
    return this;
  }

  public DomainSpec addClusterStartupItem(ClusterStartup clusterStartupItem) {
    if (this.clusterStartup == null) {
      this.clusterStartup = new ArrayList<ClusterStartup>();
    }
    this.clusterStartup.add(clusterStartupItem);
    return this;
  }

  /**
   * List of server startup details for selected clusters
   * 
   * @return clusterStartup
   **/
  @ApiModelProperty(value = "List of server startup details for selected clusters")
  public List<ClusterStartup> getClusterStartup() {
    return clusterStartup;
  }

  public void setClusterStartup(List<ClusterStartup> clusterStartup) {
    this.clusterStartup = clusterStartup;
  }

  public DomainSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Replicas is the desired number of managed servers running in each WebLogic
   * cluster that is not configured under clusterStartup. Provided so that
   * administrators can scale the Domain resource. Ignored if startupControl is
   * not AUTO.
   * 
   * @return replicas
   **/
  @ApiModelProperty(value = "Replicas is the desired number of managed servers running in each WebLogic cluster that is not configured under clusterStartup.  Provided so that administrators can scale the Domain resource.  Ignored if startupControl is not AUTO.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainSpec oracleKubernetesWeblogicDomainV1DomainSpec = (DomainSpec) o;
    return Objects.equals(this.domainUID, oracleKubernetesWeblogicDomainV1DomainSpec.domainUID)
        && Objects.equals(this.domainName, oracleKubernetesWeblogicDomainV1DomainSpec.domainName)
        && Objects.equals(this.image, oracleKubernetesWeblogicDomainV1DomainSpec.image)
        && Objects.equals(this.imagePullPolicy, oracleKubernetesWeblogicDomainV1DomainSpec.imagePullPolicy)
        && Objects.equals(this.adminSecret, oracleKubernetesWeblogicDomainV1DomainSpec.adminSecret)
        && Objects.equals(this.asName, oracleKubernetesWeblogicDomainV1DomainSpec.asName)
        && Objects.equals(this.asPort, oracleKubernetesWeblogicDomainV1DomainSpec.asPort)
        && Objects.equals(this.asNodePort, oracleKubernetesWeblogicDomainV1DomainSpec.asNodePort)
        && Objects.equals(this.asEnv, oracleKubernetesWeblogicDomainV1DomainSpec.asEnv)
        && Objects.equals(this.exportT3Channels, oracleKubernetesWeblogicDomainV1DomainSpec.exportT3Channels)
        && Objects.equals(this.startupControl, oracleKubernetesWeblogicDomainV1DomainSpec.startupControl)
        && Objects.equals(this.serverStartup, oracleKubernetesWeblogicDomainV1DomainSpec.serverStartup)
        && Objects.equals(this.clusterStartup, oracleKubernetesWeblogicDomainV1DomainSpec.clusterStartup)
        && Objects.equals(this.replicas, oracleKubernetesWeblogicDomainV1DomainSpec.replicas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainUID, domainName, image, imagePullPolicy, adminSecret, asName, asPort, asNodePort, asEnv,
        exportT3Channels, startupControl, serverStartup, clusterStartup, replicas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainSpec {\n");

    sb.append("    domainUID: ").append(toIndentedString(domainUID)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    adminSecret: ").append(toIndentedString(adminSecret)).append("\n");
    sb.append("    asName: ").append(toIndentedString(asName)).append("\n");
    sb.append("    asPort: ").append(toIndentedString(asPort)).append("\n");
    sb.append("    asNodePort: ").append(toIndentedString(asNodePort)).append("\n");
    sb.append("    asEnv: ").append(toIndentedString(asEnv)).append("\n");
    sb.append("    exportT3Channels: ").append(toIndentedString(exportT3Channels)).append("\n");
    sb.append("    startupControl: ").append(toIndentedString(startupControl)).append("\n");
    sb.append("    serverStartup: ").append(toIndentedString(serverStartup)).append("\n");
    sb.append("    clusterStartup: ").append(toIndentedString(clusterStartup)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}