import React from "react";

function PaymentList({ payments }) {

    return (

        <div className="table-container">

            <h2>Payment Records</h2>

            <table>

                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Sender</th>
                        <th>Receiver</th>
                        <th>Amount</th>
                        <th>Transaction Type</th>
                        <th>Status</th>
                    </tr>
                </thead>

                <tbody>

                    {
                        payments.map(payment => (

                            <tr key={payment.id}>

                                <td>{payment.id}</td>
                                <td>{payment.senderName}</td>
                                <td>{payment.receiverName}</td>
                                <td>{payment.amount}</td>
                                <td>{payment.transactionType}</td>
                                <td>{payment.status}</td>

                            </tr>

                        ))
                    }

                </tbody>

            </table>

        </div>
    );
}

export default PaymentList;