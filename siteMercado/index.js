const express = require('express');
const cors = require('cors');

const app = express();
const port = 3000;

app.use(cors());
app.use(express.json());

let pedido = []; // Array para armazenar os itens do pedido

// Rota para adicionar e visualizar o pedido
// Adicionar item
app.post('/pedido', (req, res) => {
  const { item, quantidade } = req.body;
  if (!item || !quantidade) {
    return res.status(400).json({ erro: 'Informe item e quantidade' });
  }
  pedido.push({ item, quantidade });
  res.status(201).json({ mensagem: 'Item adicionado' });
});

// Buscar todos os itens
app.get('/pedido', (req, res) => {
  if (pedido.length === 0) {
    return res.status(200).json({ mensagem: 'Pedido vazio' });
  }
  res.json(pedido);
});

// Consultar item específico
app.get('/buscar', (req, res) => {
  const nomeItem = req.query.item;
  if (!nomeItem) {
    return res.status(400).json({ erro: 'Informe o nome do item' });
  }

  const resultado = pedido.filter(pedido => pedido.nomeItem.includes(nomeItem))
  if (!resultado) {
    return res.status(404).json({ mensagem: 'Item não encontrado' });
  }

  res.json(resultado);
});

// Rota para excluir um item do pedido
app.delete('/pedido/:index', function (req, res) {
  const index = req.params.index; 

  if (index < 0 || index >= pedido.length) {
    return res.status(404).json({ erro: 'Item não encontrado' });
  }

  pedido.splice(index, 1);
  res.json({ mensagem: 'Item excluído' });
});

// Rota para alterar um item do pedido
app.put('/pedido/:index', function (req, res) {
  const index = req.params.index;
  const novoItem = req.body.item;
  const novaQuantidade = req.body.quantidade;

  if (index < 0 || index >= pedido.length) {
    return res.status(404).json({ erro: 'Item não encontrado' });
  }

  if (!novoItem || !novaQuantidade) {
    return res.status(400).json({ erro: 'Precisa enviar novo item e quantidade' });
  }

  pedido[index] = { item: novoItem, quantidade: novaQuantidade };
  res.json({ mensagem: 'Item alterado' });
});

// Inicia o servidor
app.listen(port, function () {
  console.log(`Servidor rodando em http://localhost:${port}`);
});