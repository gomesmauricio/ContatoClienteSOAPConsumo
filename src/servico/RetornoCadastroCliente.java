/**
 * RetornoCadastroCliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public class RetornoCadastroCliente  implements java.io.Serializable {
    private int codigoRetorno;

    private java.lang.String msgRetorno;

    private servico.Cliente retornoCliente;

    private servico.Cliente[] retornoListaCliente;

    public RetornoCadastroCliente() {
    }

    public RetornoCadastroCliente(
           int codigoRetorno,
           java.lang.String msgRetorno,
           servico.Cliente retornoCliente,
           servico.Cliente[] retornoListaCliente) {
           this.codigoRetorno = codigoRetorno;
           this.msgRetorno = msgRetorno;
           this.retornoCliente = retornoCliente;
           this.retornoListaCliente = retornoListaCliente;
    }


    /**
     * Gets the codigoRetorno value for this RetornoCadastroCliente.
     * 
     * @return codigoRetorno
     */
    public int getCodigoRetorno() {
        return codigoRetorno;
    }


    /**
     * Sets the codigoRetorno value for this RetornoCadastroCliente.
     * 
     * @param codigoRetorno
     */
    public void setCodigoRetorno(int codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }


    /**
     * Gets the msgRetorno value for this RetornoCadastroCliente.
     * 
     * @return msgRetorno
     */
    public java.lang.String getMsgRetorno() {
        return msgRetorno;
    }


    /**
     * Sets the msgRetorno value for this RetornoCadastroCliente.
     * 
     * @param msgRetorno
     */
    public void setMsgRetorno(java.lang.String msgRetorno) {
        this.msgRetorno = msgRetorno;
    }


    /**
     * Gets the retornoCliente value for this RetornoCadastroCliente.
     * 
     * @return retornoCliente
     */
    public servico.Cliente getRetornoCliente() {
        return retornoCliente;
    }


    /**
     * Sets the retornoCliente value for this RetornoCadastroCliente.
     * 
     * @param retornoCliente
     */
    public void setRetornoCliente(servico.Cliente retornoCliente) {
        this.retornoCliente = retornoCliente;
    }


    /**
     * Gets the retornoListaCliente value for this RetornoCadastroCliente.
     * 
     * @return retornoListaCliente
     */
    public servico.Cliente[] getRetornoListaCliente() {
        return retornoListaCliente;
    }


    /**
     * Sets the retornoListaCliente value for this RetornoCadastroCliente.
     * 
     * @param retornoListaCliente
     */
    public void setRetornoListaCliente(servico.Cliente[] retornoListaCliente) {
        this.retornoListaCliente = retornoListaCliente;
    }

    public servico.Cliente getRetornoListaCliente(int i) {
        return this.retornoListaCliente[i];
    }

    public void setRetornoListaCliente(int i, servico.Cliente _value) {
        this.retornoListaCliente[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoCadastroCliente)) return false;
        RetornoCadastroCliente other = (RetornoCadastroCliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoRetorno == other.getCodigoRetorno() &&
            ((this.msgRetorno==null && other.getMsgRetorno()==null) || 
             (this.msgRetorno!=null &&
              this.msgRetorno.equals(other.getMsgRetorno()))) &&
            ((this.retornoCliente==null && other.getRetornoCliente()==null) || 
             (this.retornoCliente!=null &&
              this.retornoCliente.equals(other.getRetornoCliente()))) &&
            ((this.retornoListaCliente==null && other.getRetornoListaCliente()==null) || 
             (this.retornoListaCliente!=null &&
              java.util.Arrays.equals(this.retornoListaCliente, other.getRetornoListaCliente())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCodigoRetorno();
        if (getMsgRetorno() != null) {
            _hashCode += getMsgRetorno().hashCode();
        }
        if (getRetornoCliente() != null) {
            _hashCode += getRetornoCliente().hashCode();
        }
        if (getRetornoListaCliente() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRetornoListaCliente());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRetornoListaCliente(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoCadastroCliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servico/", "retornoCadastroCliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retornoCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico/", "cliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoListaCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retornoListaCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servico/", "cliente"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
